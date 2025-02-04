# News App

A simple and modern News App built using Jetpack Compose for Android.

## Features
- Fetches and displays the latest news articles
- Category-based news filtering
- Bookmark favorite articles
- Dark mode support
- Offline reading capability

## Screenshots
(Add relevant screenshots here)

## Tech Stack
- **Kotlin** - Primary language
- **Jetpack Compose** - UI framework
- **Retrofit** - Network requests
- **Room Database** - Local storage for bookmarks
- **Coroutines & Flow** - Asynchronous programming
- **Hilt** - Dependency injection

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Abhi95081/News_App.git
   ```
2. Open the project in Android Studio.
3. Sync Gradle and run the app on an emulator or a physical device.

## API Configuration
This app fetches news from an external API. To set it up:
1. Get an API key from [NewsAPI](https://newsapi.org/) or any other news provider.
2. Add your API key to the `local.properties` file:
   ```properties
   NEWS_API_KEY=your_api_key_here
   ```
3. Ensure the app reads the API key correctly in the `gradle.properties`.

## Contribution
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-branch
   ```
3. Commit your changes and push the branch.
4. Open a Pull Request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
For any queries, feel free to reach out at [your email] or create an issue in the repository.

