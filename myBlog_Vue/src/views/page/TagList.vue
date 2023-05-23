<template>
  <div class="list-button">
    <el-button type="primary" size="large">添加标签</el-button>
  </div>
  
  <div class="list">
  <el-table :data="tableData" stripe style="width: 100%">
    <el-table-column prop="date" label="序号" width="180"/>
    <el-table-column prop="name" label="标签名称" width="180" />
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
import { gettagList } from '@/api/taglist'

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

  methods:{
    getList(){
      gettagList().then(resp => {
        this.tableData = resp.data
        console.log(resp)
      })
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
