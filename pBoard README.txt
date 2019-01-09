pBoard README
Rithika Srinivasan, Keertana Patnam, and Amanda Sun
Written on 5/1/2018


Description:
* This program will record piano playing and play it back. The window will show a graphical portrayal of a piano keyboard (one octave).
* The piano on screen will be clickable, but for further convenience, keys on the computer keyboard correspond to different piano keys. 
* The keyboard keys (S, D, F, G, H, J, K, L) will correspond to the keys for the piano octave of C major (C, D, E, F, G, A, B, C). 
* Every time one of these keys is pressed, the corresponding pitch will be played and the key will be highlighted. 
* There will be a start button on the screen, and when pressed, the notes that are played will be recorded at the time they’re played at. 

Instructions:
* Keys E, R, Y, U, and I correspond to C#, D#, F#, G#, and A# 
* Keys S-L on the keyboard will correspond to one octave on the piano (C-Major)
* Press the record button to start/stop the process of recording 
   * Play the piano keys (click keys on screen or play keyboard keys) in order to display sheet music at the top of the screen 


Features List:
* Instructions to play the program
   * There will be an instructions button for users to view instructions, and a start/resume button for the user to start/continue the game.  
* When each key is pressed, the corresponding pitch will play
* Key will play pitch when pressed
* Start/stop button for recording
* Replay button for replaying what was recorded
* Display piano on screen and keys pressed when player plays keyboard

Class List:
* Package: gui
   * Main: Instantiates a new game
   * GameFrame: holds all panels within the game (Extends JFrame)
   * GamePanel: Holds all other panels in a cardlayout
   		* Display piano, record button, and anything else that needs to be 	   
     	displayed on the screen 
   * StartPanel: Holds graphics for the start screen
   * InstructionsPanel: A panel to display instructions to the user
* Package: piano
   * Recorder: Able to record music
   * Piano: Displays piano keys on screen
   		* Draws the actual piano (called in the GamePanel)


Responsibilities list
   * Rithika: Recorder class + some GUI
   * Keertana: Piano class + lot of GUI
   * Amanda: most of GUI


