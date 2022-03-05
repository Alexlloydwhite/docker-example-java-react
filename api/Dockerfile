FROM node:17-alpine

RUN npm install -g nodemon

WORKDIR /app

COPY package.json .

RUN npm ci --include=dev

EXPOSE 4000

CMD ["npm", "run", "dev"]
