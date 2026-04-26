// Sieve of Eratosthenes : An efficient algorithm for finding all prime numbers up to a given limit. It works by iteratively marking the multiples of each prime starting from 2. The numbers which remain unmarked at the end of the algorithm are prime. 

// 1. Create a boolean array of size n+1 
// 2. Default value of all elements in the boolean array will be false, which means all numbers are initially assumed to be prime.
// 3. If the current number is prime (i.e., its corresponding boolean value is false), mark all of its multiples as non-prime (i.e., set their corresponding boolean values to true). 
// This is done by starting from the square of the current prime number and marking every multiple of it as true until we reach n.
// 4. A value in the boolean array will be set to true if the index is not a prime number.
// 5. Traverse the boolean array and print all the indices which are not marked as true.

// Time Complexity: O(n log log n) - due to the way it marks multiples of prime numbers. The inner loop runs for each prime number, and the number of operations decreases as we mark multiples.

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1]; // Default -> False
        sieve(n, primes);
    }

    // False in array means element is Prime
    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        } 

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.println(i + " ");
            }
        }
    }
}
