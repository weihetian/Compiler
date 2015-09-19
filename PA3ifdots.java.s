    .file  "main.java"
__SREG__ = 0x3f
__SP_H__ = 0x3e
__SP_L__ = 0x3d
__tmp_reg__ = 0
__zero_reg__ = 1
    .global __do_copy_data
    .global __do_clear_bss
    .text
.global main
    .type   main, @function
main:
    push r29
    push r28
    in r28,__SP_L__
    in r29,__SP_H__
/* prologue: function */
    call _Z18MeggyJrSimpleSetupv 
    /* Need to call this so that the meggy library gets set up */

# if for button up checking
    call    _Z16CheckButtonsDownv
    lds    r24, Button_Up
    # if button value is zero, push 0 else push 1
    tst    r24
    breq   MJ_L2
MJ_L1:
    ldi    r24,lo8(3)
    ldi    r25,hi8(3)
    # push two byte expression onto stack
    push   r25
    push   r24

    # Casting int to byte by popping
    # 2 bytes off stack and only pushing low order bits
    # back on.  Low order bits are on top of stack.
    pop    r24
    pop    r25
    push   r24


    ldi     r23, 3
    ldi     r24, 4
    add     r23, r24
    push    r23

    ldi     r24, 5
    push    r24


    pop     r20
    pop     r22
    pop     r24


    call   _Z6DrawPxhhh
    call   _Z12DisplaySlatev
MJ_L2:
MJ_L3:



# if for button down checking
    call    _Z16CheckButtonsDownv
    lds    r24, Button_Down
    # if button value is zero, push 0 else push 1
    tst    r24
    breq   MJ_L5
MJ_L4:
    ldi    r24,lo8(3)
    ldi    r25,hi8(3)
    # push two byte expression onto stack
    push   r25
    push   r24

    # Casting int to byte by popping
    # 2 bytes off stack and only pushing low order bits
    # back on.  Low order bits are on top of stack.
    pop    r24
    pop    r25
    push   r24



    ldi    r24,lo8(0)
    ldi    r25,hi8(0)
    # push two byte expression onto stack
    push   r25
    push   r24

    # Casting int to byte by popping
    # 2 bytes off stack and only pushing low order bits
    # back on.  Low order bits are on top of stack.
    pop    r24
    pop    r25
    push   r24

    ldi     r24, 1
    push    r24


    pop     r20
    pop     r22
    pop     r24


    
    call   _Z6DrawPxhhh
    call   _Z12DisplaySlatev
MJ_L5:
MJ_L6:

endLabel:
    jmp endLabel
    ret
    .size   main, .-main
