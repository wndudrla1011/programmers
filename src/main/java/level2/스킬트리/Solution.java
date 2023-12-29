package level2.스킬트리;

public class Solution {

    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;

        for (int i = 0; i < skill_trees.length; i++) {
            skill_trees[i] = skill_trees[i].replaceAll("[^" + skill + "]", "");
            boolean flag = false;
            for (int j = 0; j < skill_trees[i].length(); j++) {
                if (skill.charAt(j) != skill_trees[i].charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag) answer--;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }

}
