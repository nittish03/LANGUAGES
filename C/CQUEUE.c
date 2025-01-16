#include<stdio.h>
int display(int queue[],int rear){
    for(int i=0;i<=rear;i++){
        printf("%d ",queue[i]);
    }}
int cqinsert(int queue[],int rear,int n,int item,int front){
        if((front == 0 && rear == n) || front == rear+1){
                printf("overflow \n");
        return 0;
    }
            printf("enter the element to be pushed into the queue\n");
        scanf("%d",&item);
        printf("original queue was : \n");
if(front>rear){
    display(queue,front);
}else if(rear>front){
    display(queue,rear);
}
printf("\n");
    if(rear == n){
        rear = 0;
    }else{
        rear++;
    }
    queue[rear] = item;
    printf("output queue is : \n");
display(queue,rear);
    printf("\n");
        printf("new position of rear element in the queue is at %d",rear);
}
int  cqdelete(int queue[],int rear,int n,int item,int front){
printf("original queue was : \n");
if(front>rear){
    display(queue,front);
}else if(rear>front){
    display(queue,rear);
}
printf("\n");
item = queue[front];
queue[front]=0;
if(front ==n ){
front =1;
}else{
front++;
}
printf("output queue is : \n");
if(front>rear){
    display(queue,front);
}else if(rear>front){
    display(queue,rear);
}
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
        display(queue,rear);
    }else if(input == 2){
        cqinsert(queue,rear,n,item,front);
    }else if(input == 3){
        cqdelete(queue,rear,n,item,front);
    }else{
        printf("Invalid input\n");
    }
    return 0;

    
}