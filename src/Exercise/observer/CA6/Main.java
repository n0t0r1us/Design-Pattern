package observer.CA6;

public class Main {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData();
        DrashBoard drashBoard = new DrashBoard(playerData);

        playerData.updateLevel(20,5,20);
        Level level= new Level1(playerData);
        drashBoard.updateLevel(5,6,10);

    }
}
