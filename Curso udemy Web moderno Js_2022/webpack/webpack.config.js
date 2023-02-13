const modoDev = process.env.NODE_ENV !== 'production'
const webpack = require('webpack')
const MiniCssExtractPlugin = require('mini-css-extract-plugin')
const OptmizeCSSAssetsPlugin = require('optimize-css-assets-webpack-plugin')
const  TerserPlugin  = require('terser-webpack-plugin')

module.exports = {
    mode: modoDev ? 'development' : 'production',
    entry: './src/principal.js',
    output: {
        filename: 'principal.js',
        path: __dirname + '/public'
    },
    devServer:{
        static:{
            directory: "./public"
        },
        compress: true,
        port: 9000
    },
    plugins:[
        new MiniCssExtractPlugin({
            filename: "estilo.css"
        })
    ],
    optimization:{
        minimize: true,
        minimizer:[
            new TerserPlugin({
                parallel: true,
                 terserOptions:{
                    ecma: 6,
                 }
            }),
            new OptmizeCSSAssetsPlugin({})
        ]
    },
   
    module:{
        rules:[
            {
                test: /\.s?[ac]ss$/,
                use: [
                    MiniCssExtractPlugin.loader,
                   // 'style-loader', // Adicionaa CSS a DOM injetando a tag <style>
                    'css-loader', // Interpreta @import, url()...
                    'sass-loader'
                ]
            },
            {
                test: /\.(png|svg|jpg|gif)$/,
                use: ['file-loader']
            }
        ]
    }
}