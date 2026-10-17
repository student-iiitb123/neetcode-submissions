

class Solution {
    class Pair {
        int distance;
        int speed;

        public Pair(int distance, int speed) {
            this.distance = distance;
            this.speed = speed;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        Pair[] arr = new Pair[position.length];

        for (int i = 0; i < position.length; i++) {
            arr[i] = new Pair(position[i], speed[i]);
        }

        Arrays.sort(arr, (a, b) ->
            Integer.compare(b.distance, a.distance));

        Stack<Double> s = new Stack<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            double res = (double) (target - arr[i].distance)
                         / arr[i].speed;

            if (s.isEmpty() || res > s.peek()) {
                s.push(res);
                count++;
            }
        }

        return count;
    }
}
