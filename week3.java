class week3 {
 boolean isPerfectSquare(int n) {
    double s = Math.sqrt(n);
    return Math.floor(s) == s;
} 
}

class EvenOdd {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static boolean isOdd(int n){
        return !isEven(n);
    }
}

class RandomInts {
    static int random() {
        return (int) (Math.random() * 1000000);
    }

    static int randomUntil(int max) {
        return (int) (Math.random() * max);
    }

    static int randomWithin(int min, int max) {
        return (int) (Math.random() * (max-min)) + min;
    }
}

class EvenOddRandom {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static boolean isOdd(int n){
        return !isEven(n);
    }
    static int randomEven(int n){
        int e = (int) (Math.random() * n);
        if (isEven(e)){
            return e;
        }
        else
            return e+1;
    }
    static int randomOdd(int n){
        int e = (int) (Math.random() * n);
        if (isOdd(e)){
            return e;
        }
        else{
            return e+1;
        }
    }
}

class Divisors {
    static int countDivisors(int n){
        int c = 0;
        int i = n;
        while (i>0){
            if (n % i == 0){
                c = c+1;
            }
            i = i - 1;
        }
        return c;
    }
    static int sumProperDivisors(int n){
        int c = 0;
        int i = n;
        if (countDivisors(n) == 2){
            return 1;
        }
        else {
            while (i>0){
                if (n % i == 0){
                    c = c + i;
                }
                i = i - 1;
            }
            c = c - n;
            return c;
        }
        
    }
    static boolean isPrime(int n){
        return (countDivisors(n) == 2);
    }
}

class primeNumebrs{
    static int countPrimes(int n){
        int c = 0;
        int i = n;
        while (i>0){
            if (Divisors.isPrime(i) == true){
                c = c + 1;
            }
            i = i - 1;
        }
        return c;
    }
    static boolean existsPrimeBetween(int a, int b){
        int c = 0;
        int i = b-1;
        while (i>a){
            if (Divisors.isPrime(i) == true){
                c = c +1;
            }
            i = i - 1;
        }
        if (c == 0){
            return false;
        }
        else{
            return true;
        }
    }
}

class perfectNumbers{
    static boolean isPerfect(int n){
        return (Divisors.sumProperDivisors(n) == n);
    }
    static int countPerfectNumbers(int n){
        int c = 0;
        int i = n;
        while (i>0){
            if (isPerfect(i)){
                c = c + 1;
            }
            i = i - 1;
        }
        return c;
    }
}

class LargerPrimeDiff {
    static int largestPrimeDiff(int n){
        int p = 2;
        int i = 3;
        int c = 0;
        while (i<=n){
            if (Divisors.isPrime(i)){
                if (i-p>c){
                    c = i - p;
                }
                p = i;
            }
            i = i + 1;
        }
        return c;
    }
}