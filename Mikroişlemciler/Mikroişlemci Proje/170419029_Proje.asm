

org 100h

mov bx,1000h
mov ds,bx

start:
mov al, 0h
mov ah, 0
int 10h

    mov al, 1
	mov bh, 0
	mov bl, 0000_1010b
	mov cx, 36 
	mov dl, 0
	mov dh, 0
	push cs
	pop es
	mov bp, offset msg1
	mov ah, 13h
	int 10h
	jmp msg1end
	msg1 db "Memcmp icin 1, memchr icin 2 yazin: "
	msg1end:


mov ah, 1
int 21h

mov si,ax ;Okunan deger kaybolmasin diye ax deki degeri si ya atadik
    
    mov dh, 0
	mov dl, 0
	mov bh, 0
	mov ah, 2
	int 10h
    mov al,0e7h
    mov cx,40
    mov ah,9
    int 10h    ;Ekrandaki soruyu sildik
	
mov ax,si
    
cmp al,32h
je memchrstart
cmp al,31h
je memcmpstart

mov al,00h
mov ah,6h
int 10h
jmp start 


  



;MEMCHR Komutu

;bx, islemin yapilacagi bellek adresinin offset adresini tanimlar.
;al, aranacak elemanin ASCII kod karsiligini tanimlar.
;cx, bx'den kac adim gidilecegini tanimlar.

;Memchr fonksiyonu bx'de tanimlanan adresten bx+cx'e kadar, al'de tutulan degeri arar.
;Bulursa bu degerin bulundugu adresi ax'e atar. Bulamazsa ax'e 0 degerini atar.

;*memchr(const void *ptr, int c, size_t n);
memchrstart:
mov bx, 0500h ;dizi adresi *ptr
mov al, 61h;c
mov cx,4 ;n
mov si,0


memchr:
    mov ah,[bx+si]
    cmp al,ah
    je cikchr
    inc si
    loop memchr
    mov bx,0
    mov si,0                   

cikchr:


    add bx,si
    mov ax,bx    
    cmp bx,0
    je bulunamadi
    jne bulundu   

ret

bulundu:
mov al, 1
mov bh, 0
mov bl, 0000_1010b
mov cx, 29 
mov dl, 0
mov dh, 0
push cs
pop es
mov bp, offset bulundumsg
mov ah, 13h
int 10h
jmp bulundumsgsonu
bulundumsg db "Dizide aranan eleman bulundu."
bulundumsgsonu:
ret


bulunamadi:
mov al, 1
mov bh, 0
mov bl, 0000_1010b
mov cx, 32 
mov dl, 0
mov dh, 0
push cs
pop es
mov bp, offset bulunamadimsg
mov ah, 13h
int 10h
jmp bulunamadimsgsonu
bulunamadimsg db "Dizide aranan eleman bulunamadi."
bulunamadimsgsonu:
ret

;MEMCMP Komutu



;si, 1. dizinin bellek adresinin offset adresini tanimlar.
;di, 2. dizinin bellek adresinin offset adresini tanimlar.
;cx, karsilastirma sayisini tanimlar.

;Memcmp fonksiyonu si'de tanimlanan adresten si+cx'e kadar ve di'de tanimlanan adresten di+cx'e kadar
;2 diziyi karsilastirir. Eger aynilarsa ax'e 0 atar, farklilarsa ax'e 5555h degerini atar. 
;memcmp(const void *ptr1, const void *ptr2, size_t n);
memcmpstart:
mov si, 0500h ; 1. dizi adresi /ptr1
mov di, 0505h ; 2. dizi adresi /ptr2
mov cx,4;karsilastirma sayisi  /n
mov bx,0
memcmp:
    mov al,[si+bx]
    mov ah,[di+bx]
    inc bx
    cmp al,ah
    jne cikcmp
    loop memcmp

cikcmp:
    cmp cx,0
    je  ayni
    mov ax, 0FFFFh
    
mov al, 1
mov bh, 0
mov bl, 0000_1010b
mov cx, 28 
mov dl, 0
mov dh, 0
push cs
pop es
mov bp, offset farklimsg
mov ah, 13h
int 10h
jmp aynimsgsonu
farklimsg db "2 dizideki elemanlar farkli."
farklimsgsonu:
 

ret

ayni:
mov ax, 0h

mov al, 1
mov bh, 0
mov bl, 0000_1010b
mov cx, 26 
mov dl, 0
mov dh, 0
push cs
pop es
mov bp, offset aynimsg
mov ah, 13h
int 10h
jmp aynimsgsonu
aynimsg db "2 dizideki elemanlar ayni."
aynimsgsonu:


end



