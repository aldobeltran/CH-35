import * as React from 'react';
import Button from '@mui/material/Button';
import DeleteIcon from '@mui/icons-material/Delete';
import SendIcon from '@mui/icons-material/Send';

const Buttons = () => {
    return (
        <>
        <Button variant="outlined" startIcon={<DeleteIcon />}>
        Delete
        </Button>
        <Button variant="contained" endIcon={<SendIcon />}>
        Send
        </Button>
        </>
    )
}

export default Buttons