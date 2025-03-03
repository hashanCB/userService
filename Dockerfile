FROM node:20-alpine

WORKDIR /app

COPY package-lock.json package.json ./

RUN npm install

COPY . .

ENTRYPOINT ["npm","start"]