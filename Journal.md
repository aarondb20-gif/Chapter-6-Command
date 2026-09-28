# Journal

Phase 1
The EditorApp is decoupled from the TextEditor through the command interface that allows the invoker to send
the commands by proxy where the receiver doesn't need to know the command methods. If you wanted to insert
text without using the command object you would have to create some kind of loop that allows you to call 
the insert text or execute method over and over.
