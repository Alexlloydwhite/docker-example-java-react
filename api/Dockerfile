FROM node:17-alpine

RUN npm install -g nodemon

WORKDIR /app

COPY . .

RUN npm ci

EXPOSE 4000

CMD ["npm", "run", "dev"]
