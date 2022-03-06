const request = require("supertest");
const app = require("./app");

describe("App", () => {
  test("Returns Docker Message", async () => {
    // WHEN
    const response = await request(app).get("/getDockerMessage");

    // THEN
    expect(response.statusCode).toBe(200);
    expect(response.body).toStrictEqual({
      dockerMessage: "Hello from docker!",
    });
  });
});
