
>### To run a project using javafx and fxml 

```powershell
java --module-path /path/to/javafx-sdk-VERSION/lib --add-modules javafx.controls,javafx.fxml -cp .\target\filehandler-1.0-SNAPSHOT.jar com.example.filehandler.Testing
```

---

<br>
<br>
<br>
<br>

>### To run a project including `JSON` parsing

<br>
<br>

- In the `-cp` flag mention current dir and path where `json-parsing-libraries(lib)` are stored

```powershell
java -cp ".;path\to\json\lib" Class-Name
```
