import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreMap = new HashMap<>();
        Map<String, List<int[]>> idxMap = new HashMap<>();
        
        for(int i=0; i<genres.length; i++){
            genreMap.put(genres[i],genreMap.getOrDefault(genres[i],0) + plays[i]);
            
            if(!idxMap.containsKey(genres[i])) idxMap.put(genres[i],new ArrayList<>());
            
            idxMap.get(genres[i]).add(new int[] {i, plays[i]});
        }
        
        List<Map.Entry<String, Integer>> genreList = new ArrayList<>(genreMap.entrySet());
        Collections.sort(genreList, (a,b) -> b.getValue() - a.getValue());
        
        List<Integer> result = new ArrayList<>();
        
        for(Map.Entry<String, Integer> entry : genreList) {
            String genre = entry.getKey();
            List<int[]> songList = idxMap.get(genre);
            
            Collections.sort(songList, (a,b) -> {
                if(b[1] == a[1] ) return a[0] - b[0];
                return b[1] - a[1];
            });
            
            for(int i=0; i<songList.size() && i<2; i++){
                result.add(songList.get(i)[0]);
            }
        }
        
        int[] answer = new int[result.size()];

        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}