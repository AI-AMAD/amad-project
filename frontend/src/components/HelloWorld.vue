<template>
  <v-container>
    <v-card class="mx-auto" max-width="344" variant="outlined">
      <v-card-item>
        <div>
          <div class="text-overline mb-1">Toy Project!!</div>
          <div class="text-h6 mb-1">Spring + vue + mysql + docker + CI/CD</div>
          <div class="text-caption">버튼을 클릭하면 db에서 가져온 값을 출력합니다.</div>
        </div>
      </v-card-item>
      <v-card-actions>
        <v-btn @click="test()" variant="outlined"> Button </v-btn>
      </v-card-actions>
        <span style="margin-left: 10px;">db 에서 가져 온 값 입니다.</span>
        <li v-for="item in dataList" :key="item.id" style="margin-left: 10px;">{{ item.mb_id }}</li>
    </v-card>
  </v-container>
</template>

<script>
import axios from "axios";
import {ref} from "vue";

export default {
  setup() {
    const dataList = ref([]);

    const test = () => {
      axios.get("/api/getAll").then((res) => {
        dataList.value = res.data;
        console.log(dataList);
      });
    };

    return {
      test,
      dataList
    };
  },
};
</script>
