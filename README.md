# RepMax Kotlin

> A Kotlin and React One-Rep Max (1RM) calculator.

![Screenshot](https://imgur.com/Q8BputN.png)

Created with the [create-react-kotlin-app](https://github.com/JetBrains/create-react-kotlin-app) tool.

This is a simple progressive web app capable of calculating [one-repetition maximums](https://en.wikipedia.org/wiki/One-repetition_maximum) for weight training.
This is primarily an experimental web app written in [React](https://reactjs.org/) and [Kotlin](https://kotlinlang.org/) and is a port of [a similar RepMax repo]((https://github.com/ckjeldgaard/repmax)) written in TypeScript.

## Build Setup

``` bash

# serve with hot reload at localhost:3000
npm start

# build for production with minification
npm run build

```

## Limitations

* Currently no units test due to lack of a Jest Kotlin wrapper. [See this note](https://github.com/JetBrains/create-react-kotlin-app#limitations).
* Currently no progressive web app support due to lack of service worker.