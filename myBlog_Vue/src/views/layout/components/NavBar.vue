<template>
  <div class="navbar">
    <!-- 面板折叠折叠 -->
    <Hamburger />
    <!-- 面包屑 -->
    <Breadcrumb style="line-height:3" class="navbar-breadcrumb"/>
    
    <div class="navbar-usermenu">
        <!-- 最右侧用户 -->
    </div>
  </div>
</template>

<script>
import Hamburger from '@/components/Hamburger/index.vue'
import Breadcrumb from '../../../components/Breadcrumb/index.vue'
export default {
  components: { Breadcrumb,Hamburger },

}
</script>

<style>
.navbar{
    display: flex;
    
}
.navbar-breadcrumb{
    padding-left: 20px;
}
</style>