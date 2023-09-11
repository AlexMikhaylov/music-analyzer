# Music Analyzer

Music Analyzer is an application designed to assist users in analyzing their music tracks. With features such as file upload, music analysis, data visualization, and detailed report generation, this project serves as a comprehensive tool for any music enthusiast or professional looking to derive insights from their tracks.

## Features

1. **File Upload and Management**
    - Users can upload their music files.
    - Supported formats: [Specify the formats e.g., MP3, WAV, etc.]

2. **User Management**
    - User registration, login, and logout functionalities.
    - Email confirmation upon registration (Optional but adds an extra layer of security).

3. **Music Analysis**
    - Extract and analyze BPM, Pitch, Volume, and Frequency Spectrum.
    - Real-time analysis and data visualization.

4. **Data Visualization**
    - Interactive graphs and charts showcasing the music properties.
    - Comparison between multiple tracks.

5. **Report Generation**
    - Generate detailed reports on the analyzed tracks.
    - Downloadable in various formats.

## Getting Started

### Prerequisites

- Java 17
- Maven
- PostgreSQL (For development and production)
- H2 Database (For testing)

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/AlexMikhaylov/music-analyzer.git
    cd music-analyzer
    ```

2. Configure your database connection in `application.properties` or specific profiles like `application-dev.properties` or `application-prod.properties`.

3. Build and run the application:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## Development

You can specify the active profile (dev, prod, test) using:
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

For the `dev` and `prod` profiles, ensure you have your PostgreSQL instance running and properly configured.

For testing, the application uses the H2 in-memory database. No extra configuration is needed.
