<template>
  <div class="app-wrapper">
    <div class="sidebar-container">
        <SideBar />
    </div>
    <div class="main-contianer">
        <div class="navbar-container">
            <NavBar />
        </div>
        <ContentMain />
    </div>
  </div>
</template>

<script>
import { NavBar, SideBar, ContentMain } from './components';
export default {
  components: { SideBar, ContentMain, NavBar },

}
</script>

<style>
.sidebar-container{
    position: fixed;
   width: 200px;
   height: 100%;
   background-color: #2b2f3a;
}

.app-wrapper{
    display: flex;
    height: 100%;
    width: 100%;
    /* background-color: #99CCCC; */
    

}

.main-contianer{
    height: 100%;
    width: 100%;
    padding-left: 200px;
    /* position: relative; */
}

.navbar-container{
    width: 100%;
    position: fixed;
    height: 47px;
    background-color: #fff;
    box-shadow: 0 2px 4px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04)
}
</style>