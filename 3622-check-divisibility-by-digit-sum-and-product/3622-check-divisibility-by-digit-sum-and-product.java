class Solution {
    int sum=0;
    int mul=1;
    public boolean checkDivisibility(int n) {
        int m=n;
        while(n>0){
            int last=n%10;
            sum=sum+last;
            mul=mul*last;
            n=n/10;
        }
        if(m%(mul+sum)==0) return true;
        else return false;
    }
}