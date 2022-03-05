const app = require("./app");

const PORT = 4000;

app.listen(PORT, () => {
  console.log(`listening for requests on port: ${PORT}`);
});
