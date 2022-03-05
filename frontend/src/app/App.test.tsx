import { render, screen } from "@testing-library/react";
import { App } from "./App";

test("renders text", () => {
  // WHEN
  render(<App />);
  const linkElement: HTMLElement = screen.getByText(/Docker Frontend/i);

  // THEN
  expect(linkElement).toBeInTheDocument();
});
