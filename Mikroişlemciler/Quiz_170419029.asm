org 100h

mov al, 00h
mov ah, 0
int 10h

mov si,10
kutubastir:
    
    
    mov dx,si
    mov dh,dl
    mov dl,5
    mov ah,2
    int 10h
    
    mov al,0DBh     ;Kutu karakteri
    mov bl,1100b    ;Acik kirmizi
    mov cx,10
    
    mov ah,09h
    int 10h
    
    dec si
    mov cx,si
    loop kutubastir
    



mov ax, 0
int 33h


farekontrol:
    mov ax, 1
    int 33h
    mov ax, 3
    int 33h
    mov ax,1
    cmp bx,1
    jne farekontrol

mov ah, 8h
mov bh,0
int 10h

mov bh,0

mov bl,0dbh ;Kutu sembolune
cmp Al,bl   ; tiklama kontrolu
jne farekontrol

mov dh, 15
mov dl, 15
mov bh,0
mov ah,0
int 10h


yazdir:
    mov dx, offset msg
	mov ah, 9
	int 21h    
    
cik:    

ret

msg db "Muhammed Yusuf Macit 170419029 $"




