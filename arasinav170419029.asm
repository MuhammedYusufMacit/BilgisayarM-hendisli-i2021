mov si,0
mov cx,10
mov bx,1000h
mov ds,bx
dizikur:
    mov [0300h+si],si
    inc si
    loop dizikur
    mov si,0
    mov cx,10

dongu:
    mov bx, 1000h
    mov ds, bx
    mov al,[0300h+si] 
    mov dl,3
    mul dl
    add al,7  
    mov dl,5
    div dl
    mov bx,2000h
    mov ds,bx      
    mov [0400h+si],ax
    inc si
    loop dongu
    
    
end    

