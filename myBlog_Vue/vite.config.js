import { fileURLToPath, URL } from 'node:url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// const baseurl = "http://localhost:8989/"

// If your port is set to 80,
// use administrator privileges to execute the command line.
// For example, Mac: sudo npm run
// You can change the port by the following methods:
// port = 9528 npm run dev OR npm run dev --port = 9528
const port = process.env.port || process.env.npm_config_port || 9528 // dev port

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [vue()],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  },
  
    server:{
      cors:true,  //默认启动并允许任何源
      open: false,  //默认打开浏览器
      port: port,   //访问端口
      host: "0.0.0.0",  //访问的地址   0.0.0.0  即所有可访问的host
      proxy:{
        '/api': {
          target: `http://localhost:8989`,   //目标地址
          ws: true,
          secure: true,
          changeOrigin:true,   //是否允许跨域代理
          rewrite:(path) => path.replace(/^\/api/, '')    //重写路径   vue3写法  vue2写法：pathWrite:{}
        }
      },
    },
})

