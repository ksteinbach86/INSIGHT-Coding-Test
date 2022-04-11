// Example of running a web based API linking to the geocoding.geo.census page
// Would love to see this in action! 
   import axios from 'axios';

const http = axios.create({
       baseURL: "https://geocoding.geo.census.gov/geocoder/returntype/searchtype?parameters"
   });

   export default {

       list() {
           return http.get('/locations');
       },

       get(id) {
           return http.get(`/coordinates/${id}`);
       }

   }
