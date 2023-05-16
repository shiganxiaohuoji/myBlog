import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import 'element-plus/dist/index.css'
import ElementPlus from 'element-plus'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
// import store from './store'
import './assets/base.css'

const app = createApp(App)

app.use(router)
app.mount('#app')
app.use(ElementPlus)
// app.use(store)

for ([name, comp] of Object.entries(ElementPlusIconsVue)) {
    app.component(name, comp);
  }