<template>
  <div class="list-button">
    <el-button type="primary" size="large">添加分类</el-button>
  </div>
  
  <div class="list">
  <el-table :data="tableData" style="width: 100%">
    <el-table-column prop="date" label="序号" width="180"/>
    <el-table-column prop="name" label="分类名称" width="180" />
    <el-table-column prop="description" label="描述" />
    <el-table-column prop="operation" label="操作">
      <template #default>
        <el-button link type="primary" size="small" @click="handleClickDelete"
          >删除</el-button
        >
        <el-button link type="primary" size="small" @click="handleClickEditor">编辑</el-button>
      </template>
    </el-table-column>
  </el-table>
</div>
</template>

<script>
import { getcategoryList } from '@/api/categorylist'
import axios from 'axios'

export default {
  data(){
    return{
      tableData:[
      {
      date: '',
      name: '',
      description: '',
      },
      ]
    }
  },

  created(){
    this.getList()
  },

  mounted(){

  },

  methods:{
    getList(){
      getcategoryList().then(resp => {
        this.tableData = resp.data
        console.log(resp)
      })
      // axios.get('/api/bloglist/getList').then(resp =>{
      //   console.log(resp.data)
      //   this.tableData = resp.data
      // })
    },
    handleClickDelete(){
      console.log(this.tableData);
    },
    handleClickEditor(){
      console.log(this.tableData);
    }
  }

}
</script>


<style scoped>
.list{
  padding: 20px 0px;
}

.list-button{
  padding-top: 20px;
  padding-left: 10px;
}
</style>
