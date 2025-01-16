#include<stdio.h>
int display(int queue[],int rear){
    for(int i=0;i<=rear;i++){
        printf("%d ",queue[i]);
    }
}
int qinsert(int queue[],int rear,int n,int item,int front){

        if(rear == n){
        printf("Queue Overflow\n");
        return 0;
    }
            printf("enter the element to be pushed into the queue\n");
        scanf("%d",&item);
        printf("original queue was : \n");
display(queue,rear);
printf("\n");
    rear++;
    printf("output queue is : \n");
    queue[rear] = item;
display(queue,rear);
    printf("\n");
        printf("new position of rear element in the queue is at %d",rear);

}
int  qdelete(int queue[],int rear,int item,int front){

printf("original queue was : \n");
display(queue,rear);
printf("\n");
item =queue[front];
queue[front]=0;

front++;
printf("output queue is : \n");
display(queue,rear);
    printf("\n");
    printf("new position of front element in the queue is at %d",front);

}
int main(){

    int queue[10]={1,2,3,4,5,6};
    int front = 0,rear = 5;
    int n = 10;
    int input=0;
    int item;
    printf("enter 1 to display the queue\nenter 2 to enter a item in the queue\nenter 3 to delete a item from the queue\n");
    scanf("%d",&input);
    if(input==1){
            printf("queue is : \n");
        display(queue,rear);
    }else if(input == 2){
        qinsert(queue,rear,n,item,front);
    }else if(input == 3){
        qdelete(queue,rear,item,front);
    }else{
        printf("Invalid input\n");
    }
    return 0;

}