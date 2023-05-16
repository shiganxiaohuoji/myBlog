<template>
  <div class="sidebar-logo-container">
    <router-link to="/DashBoard" class="sidebar-link">
        <img src="@/assets/logo/fallstar.png" class="sidebar-logo">
        <div class="sidebar-title"><h1 class="sidebar-title">CeySTAR</h1></div>
    </router-link>
      
    </div>
</template>

<script>
export default {
    data(){
        return{
            
        }
    }

}
</script>

<style>

.sidebar-logo-container{
    display: flex;
    width: 100%;
    /* height: 50px; */
    /* line-height: 50px; */
    background-color: #2b2f3a;
    text-align: center;
    overflow: hidden;

}

.sidebar-logo{
    width: 40px;
    height: 40px;
    /* margin-top: 4px;
    margin-right: 15px;
    margin-left: 5px; */
    /* vertical-align: middle; */
    
}

.sidebar-title{
    color: #fff;
    font-size: 20px;
    vertical-align: middle;
    /* display: inline-block; */
    font-weight: 500;
    line-height: 25px;
}

.sidebar-link{
    width: 100%;
    height: 100%;
}
</style>