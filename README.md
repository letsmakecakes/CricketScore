# Cricket Score

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

Cricket Score is a mobile application that provides ball-by-ball information, live scores, and batting & bowling statistics for cricket matches. It allows users to track and analyze cricket matches, view player stats, and maintain a record of match history. The app is designed to be compatible with all phones and offers a user-friendly interface.

## Stakeholders

- [Rini Sahu](https://github.com/RiniSah)
- Adwaith Rajeev
- [Akanksha Sinha](https://github.com/sinhaakankshasinha)
- [Damodar Pai](https://github.com/damuspirit)
- [Rahul Maity](https://github.com/foxyfool)

## Features

- **Setting features:**
  - Change background/theme
  - Change the number of match records in history/stat (default last 10, last 30, all)
  - Change limit to undo operation
  - Clear record history
  - Exit

- **Record databases for match/player statistics:**
  - The database is auto-created and updated.

- **Notification:**
  - Receive a message notification on match finish (win/loss).

- **Match score management:**
  - Update match score
  - Undo score updates
  - View scorecard
  - View player stats for the match

- **Team and player statistics:**
  - View overall team/player statistics

## New Features

Within the main home page, the following options are available:

- **Add match:** Add a new match by selecting match teams, venue, toss winner, and their decision to bat or bowl. Also specify the total match overs. Includes a button to start the match.

- **Match history:** Displays previous match statistics.

- **Player stats:** Displays the statistics of each player.

During the match:

- The **start match** button redirects to a page where you can select the striker, non-striker, and bowler. It also includes a next button.

- The **next** button redirects to the scoreboard page, where you can swap batsmen after each run/over, add a new batsman, and update the overs and runs for both batsmen and bowlers.

- After each over, a new page is opened to add the new bowler. After a wicket, a new batsman is added. This process is repeated for the second team's batting after the completion of the total overs.

- After both teams' batting is completed, the results are posted in the match history tab.

## Project and Scope

The growing trend of mobile app downloads, especially in the sports segment, presents an opportunity to develop an application that provides ball-by-ball information, live scores, and batting & bowling statistics. Cricket Score aims to fulfill this need by delivering real-time match updates and comprehensive player statistics.

## Risks and Assumptions

- **Screen Variability:** The challenge of developing a flexible app that adjusts to different screen sizes and platforms, considering the wide variety of devices used by users.

- **Features and Performance:** The app must deliver ball-by-ball scores in real-time while ensuring optimal performance.

- **App Noticeability:** To stand out among the numerous mobile apps, Cricket Score needs to be easily discoverable and provide a unique user experience.

## Requirements Specifications

Cricket Score aims to be an application compatible with all phones that provides the following features:

- Ball-by-ball information
- Live scores
- Batting & bowling statistics
- Overall player stats

## Solution Overview

- **Great Imagination Design:** Emphasizing modern and user-friendly design to enhance usability.

- **Working Offline:** Ensuring seamless usage of the app both online and offline.

- **Intuitive Features:** Attention to detail in incorporating all the necessary features, including meticulous ball recording and end-of-match analysis.

- **Responsive Design:**

 Employing responsive design principles to adapt to different screen dimensions and enhance the user experience.

## License

This project is licensed under the [MIT License](LICENSE).
