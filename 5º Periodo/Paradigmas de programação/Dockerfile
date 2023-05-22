# Start your image with a node base image
FROM ruby

# The /app directory should act as the main application directory

# Copy the app package and package-lock.json file

# Copy local directories to the current local directory of our docker image (/app)
COPY ./lib ./lib
COPY ../damas ../damas

# Install node packages, install serve, build the app, and remove dependencies at the end


# Start the app using serve command
CMD [ " ruby .\damas.rb" ]
