#include <stdio.h>
#include <stdlib.h>

typedef struct node{
    int data;

    struct node*left;
    struct node*right;    
}node;

node* insert(node*root, int data){
    node *temp = (node*) malloc(sizeof(node));

    temp->data = data;
    temp->left = NULL;
    temp->right = NULL;

    if (root == NULL){
        root = temp;
    }
    else{
        node *current = root;
        node *parent = NULL;
        while (1)
        {
            parent = current;
            if(data < parent->data){
                current = current ->left;
                if (current == NULL)
                {
                    parent ->left = temp;
                    return root;
                }

            }
            else{
                current = current ->right;

                if (current == NULL)
                {
                    parent ->right = temp;
                    return root;
                }
                

            }

        }
        
    }
    return root;

}

int main(void){
    int i;
    
    int array[14] = {34 , 84,15 ,0 ,2 ,99 ,79 ,9 ,88 ,89 ,18 ,31 ,39 ,100 ,101};
    node *root = NULL;

    for ( i = 0; i < 13; i++)
    {
       root = insert(root, array[i]);
       printf("inserted: %d\n", array[i]);

    }
    int temp = search(root, 88);
    if (temp)
    {
        printf("[%d] Found\n", temp->data); 

}
    else{
        printf("[x](%d) Not found\n", i);

    }
return 0;