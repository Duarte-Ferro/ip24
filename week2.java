class week2 {
 double abs(double n) {
    if(n<0) {
        return -n;
    }
    else {
        return n;
    }
}


int max(int a, int b) {
    if (a<b){
        return b;
    }
    else{
        return a;
    }
}


int min(int a, int b){
    if (a<b){
        return a;
    }
    else{
        return b;
    }
}


int irsGroup(int n){
    if (n<10000){
        return 1;
    }
    if (n>=10000 && n<=25500){
        return 2;
    }
    if (n>25500 && n<=48500){
        return 3;
    }
    if (n>48500){
        return 4;
    }
    else{
        return 0;
    }
}


double irsTax (int n){
    if (n==1){
        return 0.12;
    }
    if (n==2){
        return 0.18;
    }
    if (n==3){
        return 0.23;
    }
    if (n==4){
        return 0.29;
    }
    else{
        return 0.0;
    }
}


static void varAssign() {
int n = 1;
n = 2;
n = n + 1;
n = n + 1;
n = n + 1;

}

static void varAssignDiv() {
int v=2024;
v=v/10;
v=v/10;
v=v/10;

}

int firstDigit(int n){
    while (n>10){
        n=n/10;
    }
    return n;
}


static void naturalsIterator() {
int i = 1;
while(i < 5) {
   i = i + 1;
}

}

int sumNaturals(int max){
    int s=0;
    int i=1;
    while(i<=max){
        s=s+i;
        i=i+1;
    }
    return s;
}


static void reverseIteration() {
int x = 5;
while (x>0){
    x--;
}

}

int powerOfTwo(int e){
    int n = 1;
    if (e==0){
        return 1;
    }
    else{
        while(e!=0){
        n = n*2;
        e = e-1;
        }
    return n;
    }
}



boolean isMultiple(int m, int n){
    while (m>0){
        m = m-n;
    }
    if (m==0){
        return true;
    }
    else{
        return false;
    }
}


int intDivision(int m, int n){
    int i = 0;
    while (m >= n){
        m = m - n;
        i = i + 1;
    }
    return i;
}


static void iterationStepTwo() {
int p = 2;
while (p<10){
    p = p + 2;
}

}

int sumEvenBetween(int min, int max){
    int sum = 0;
    while (min <= max){
        if (min % 2 == 0){
            sum = sum + min;
            min = min + 1;
        }
        if (min % 2 != 0){
            min = min + 1;
        }
    }
    return sum;
}


char nextLetter(char n){
    if (n=='z'){
        return 'a';
    }
    else{
        return (char) (n+1);
    }
}


int gcd(int a, int b){
    while (b != 0){
        int c = a % b;
        a = b;
        b = c;
    }
    return a;
}


int invert(int n){
    int i = 0;
    while(n > 0){
        int a = n % 10;
        i = i*10+a;
        n = n / 10;
    }
    return i;
}


int fib(int n){
    int f = 1;
    int c = 0;
    int a = 0;
    while (n> 0){
        a = f + c;
        f = c;
        c = a;
        n= n - 1;
    }
    return a;
}
 
}

class IrsUtil {
    static int irsGroup(int n){
            if (n<10000){
                return 1;
            }
            if (n>=10000 && n<=25500){
                return 2;
            }
            if (n>25500 && n<=48500){
                return 3;
            }
            if (n>48500){
                return 4;
            }
            else{
                return 0;
            }
        
    }
    static double irsTax (int n){
            if (n==1){
                return 0.12;
            }
            if (n==2){
                return 0.18;
            }
            if (n==3){
                return 0.23;
            }
            if (n==4){
                return 0.29;
            }
            else{
                return 0.0;
            }
    }
}
