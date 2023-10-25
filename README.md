# ZoeTech
## Use Case
A user wants to reschedule his meeting. To do this, he will choose a valid day and time for the meeting, change the type of meeting to a video conference, and confirm the change. This is going to be reflected in a confirmation message.
### How to use it

1. Clone the repo
   ```shell
   git clone https://github.com/Dafellow/ZoeTech.git
   ```
2. Move to the automation folder
   ```shell
   cd ZoeAutomation/src
   ```
3. Execute the following Maven command replacing the {day} with the day you want to use to reschedule and {URL} with your current calendar URL e.g.,
"27" & "https://portal-test.zoefin.com/reschedule/66965aa0-9c17-11ed-b52a-53af9ee871d5"
   ```shell
   mvn clean test -Dday={day} -DURL={URL}
   ```