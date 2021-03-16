@startuml
class MySingleton{

    -mySingleton: MySingleton
    -MySingleton()
    +getSingelton(): MySingleton
    +showMessage()

}

class Main

@enduml
