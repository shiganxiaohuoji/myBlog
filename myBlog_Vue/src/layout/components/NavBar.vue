<template>
  <div class="navbar">
    <!-- 面板折叠折叠 -->
    <Hamburger class="navbar-hamburger" />
    <!-- 面包屑 -->
    <Breadcrumb  class="navbar-breadcrumb"/>
    
    <div class="navbar-usermenu">
        <!-- 最右侧用户 -->
    </div>
  </div>
</template>

<script>
import Hamburger from '@/components/Hamburger/index.vue'
import Breadcrumb from '../../components/Breadcrumb/index.vue'
export default {
  components: { Breadcrumb,Hamburger },

}
</script>

<style lang="scss" scoped>
.navbar{
    height: 50px;
    overflow: hidden;
    position: relative;
    background: #fff;
    box-shadow: 0 1px 4px rgba(0, 21, 41, .08);
    user-select: none;

    .navbar-hamburger{
      line-height: 2;
      height: 100%;
      float: left;
      cursor: pointer;
      transition: background .3s;
      -webkit-tap-highlight-color: transparent;

			&:hover {
				background: rgba(0, 0, 0, .025)
			}
    }

    .navbar-breadcrumb{
      float: left;
      line-height: 4;
    }
    
}

</style>