int t = int.Parse(Console.ReadLine());

for(int i=0; i<t; i++){
    int k = int.Parse(Console.ReadLine());
    int cnt = 0;
    int num = 1;
    while(true){
        //numbers he dislike
        if(num%3==0||num%10==3){
            num+=1;
            continue;
        }
        
        //numbers he like
        cnt+=1;
        
        if(cnt==k){
            Console.WriteLine(num);
            break;
        }
        
        num+=1;
    }
}
