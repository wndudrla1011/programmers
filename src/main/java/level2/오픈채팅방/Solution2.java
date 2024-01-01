package level2.오픈채팅방;

import java.util.*;

public class Solution2 {

    static final String ENTER = "%s님이 들어왔습니다.";
    static final String LEAVE = "%s님이 나갔습니다.";
    static Map<String, UserInfo> map = new HashMap<>(); //<ID, Nickname>

    public String[] solution(String[] records) {
        List<Command> commandList = new ArrayList<>();

        for (String record : records) {
            String[] str = record.split(" ");
            String command = str[0];
            String userId = str[1];
            String nickName = null;

            switch (command.charAt(0)) {
                case 'E':
                    nickName = str[2];
                    if (!map.containsKey(userId)) {
                        map.put(userId, new UserInfo(userId, nickName));
                    } else {
                        map.get(userId).nickName = nickName;
                    }
                    commandList.add(new Command(command.charAt(0), userId));
                    break;
                case 'L':
                    commandList.add(new Command(command.charAt(0), userId));
                    break;
                case 'C':
                    nickName = str[2];
                    map.get(userId).nickName = nickName;
                    break;
            }
        }

        return commandList.stream()
                .map(cmd -> String.format(cmd.command == 'E' ? ENTER : LEAVE, map.get(cmd.userId).nickName))
                .toArray(arr -> new String[commandList.size()]);
    }

    static class UserInfo {
        String userId;
        String nickName;

        public UserInfo(String userId, String nickName) {
            this.userId = userId;
            this.nickName = nickName;
        }
    }

    static class Command {
        char command;
        String userId;

        public Command(char command, String userId) {
            this.command = command;
            this.userId = userId;
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"}));
    }

}
