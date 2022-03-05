FROM node:16.14.0-alpine

RUN npm install -g nodemon

WORKDIR /app

COPY . .

RUN npm install

RUN npm ci --only=production

COPY . /app

EXPOSE 4000

CMD ["npm", "run", "dev"]
