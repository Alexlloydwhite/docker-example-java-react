import { render, waitFor } from "@testing-library/react";
import "@testing-library/jest-dom/extend-expect";
import { App } from "./App";

describe("App", () => {
  it("Renders Message", async () => {
    // GIVEN:
    const mockResponse = { dockerMessage: "Hello from Docker!" };
    const mResponse = { json: jest.fn().mockResolvedValueOnce(mockResponse)};
    const mockFetch = jest.fn().mockResolvedValueOnce(mResponse as any);
    (global as any).fetch = mockFetch;

    // WHEN:
    const { getByTestId } = render(<App />);
    const div = await waitFor(() => getByTestId('test'));

    // THEN:
    expect(div).toHaveTextContent('Hello from Docker!');
    expect(mockFetch).toBeCalledTimes(1);
    expect(mResponse.json).toBeCalledTimes(1);
  });
});
