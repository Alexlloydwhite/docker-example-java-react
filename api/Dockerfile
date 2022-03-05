# Parent Image. Node version 17 with Alpine Linux
FROM node:17-alpine

# Install nodemon
RUN npm install -g nodemon

# Sets the app directory on the image as the root directory, 
# where we will run commands
WORKDIR /app

# Copy our app into an app folder on the image
COPY package.json .

# Install dependencies while image is being built
RUN npm install

# Specifiy the port to expose
EXPOSE 4000

# After image is built, run the build
CMD ["npm", "run", "dev"]
