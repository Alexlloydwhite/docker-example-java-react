const express = require("express");
const cors = require("cors");

const app = express();
app.use(cors());

app.get("/getDockerMessage", (req, res) => {
  res.json({ dockerMessage: "Hello from docker!" });
});

module.exports = app;
