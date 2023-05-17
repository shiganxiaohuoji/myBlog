<template>
    <logo />
    <el-scrollbar >
        <el-menu 
        background-color="#304156" 
        text-color="#bfcbd9" 
        active-text-color="#409EFF" 
        router>
          <!-- 没有子类的导航 -->
          <el-menu-item :index="item.path" v-for="item in noChildren" :key="item.path">
            <i class="el-icon-document"></i>
            <span>{{ item.name }}</span>
          </el-menu-item>
          
          <!-- 有子类的导航 -->
          <el-sub-menu :index="item.path" v-for="(item, index) in hasChildren" :key="index" :base-path="item.path" >
            <template #title>
              <el-icon></el-icon>{{ item.meta.title}}
            </template>
              <el-menu-item :index="subitem.path" v-for="subitem in item.children" :key="resolvePath(item.path,subitem.path)">
                <i class="el-icon-setting"></i>
                <span>{{subitem.meta.title}}</span>
              </el-menu-item>
          </el-sub-menu>
        </el-menu>
    </el-scrollbar>
</template>

<script>
import path from 'path'
import Logo from '../SideBar/Logo.vue'
import {Search, House} from '@element-plus/icons-vue'
export default {
  components: {
    Search, House, Logo
  },
    data() {
      return {
        MenuList: null,
      }
    },
    created(){
      console.log(this.$router)
      // getList
    },
    computed: {
      // 判断导航栏是否有子节点
      noChildren() {
        console.log("这是noChildren")
        console.log( this.$router.options.routes.filter(item => !item.children))
        return this.$router.options.routes.filter(item => !item.children)
      },
      hasChildren() {
        console.log("这是hasChildren")
        console.log( this.$router.options.routes.filter(item => item.children))
        return this.$router.options.routes.filter(item => item.children)
      }
    },
    methods: {
      getList(){
        this.MenuList = this.$router.options.routes
        console.log(this.MenuList)
      },
      handleclick(){
        
      },
      resolvePath(basePath,routePath) {
      //basePath = this.basePath;
      //allPath = this.basePath.concat(routePath)
      return this.basePath.concat(routePath);
				// if (isExternal(routePath)) {
				// 	return routePath
				// }
				// if (isExternal(this.basePath)) {
				// 	return this.basePath
				// }
				//return path.resolve(this.basePath, routePath)
			}
    }

}
</script>

<style>
.sidebar-logo{
  display: flex;
}
.sidebar{
  width: 180px;
}
</style>
