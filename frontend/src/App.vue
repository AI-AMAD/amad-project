<template>
  <v-app>
    <v-main>
      <HelloWorld></HelloWorld>
    </v-main>
  </v-app>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue';
import axios from "axios";

export default {
  name: 'App',

  components: {
    HelloWorld,
  },

}
</script>
