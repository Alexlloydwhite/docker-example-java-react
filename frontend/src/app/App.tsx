import React from "react";
import "./App.css";

const getDockerMessage = async (url: string) => {
  const response = await fetch(url, {
    headers: {
      accepts: "application/json",
    },
    method: "GET",
    mode: "cors",
  });

  return response.json();
};

export const App: React.FC = () => {
  const [dockerMessage, setDockerMessage] = React.useState<string>();

  React.useEffect(() => {
    const url = "/getDockerMessage";
    getDockerMessage(url).then((data) => setDockerMessage(data.dockerMessage));
  }, []);

  return (
    <div data-testid="test" className="App">
      {dockerMessage}
    </div>
  );
};
