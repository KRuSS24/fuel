

const openBtn = document.getElementById('openForm');
const openEditBtn= document.getElementById('openEditForm');
const form = document.getElementById('formBlock');
const editForm = document.getElementById("editForm")
// const driver_list[]=document.getElementsByClassName('driver_list');

// показать форму
openBtn.addEventListener('click', function (e) {
    e.preventDefault();
    if(form.classList.contains('form-hidden')){
        form.classList.remove('form-hidden');
        form.classList.add('form-visible');
    } else {
        form.classList.remove('form-visible');
        form.classList.add('form-hidden');
    }

});

// скрыть
form.addEventListener('submit', function () {
    // e.preventDefault();
    form.classList.remove('form-visible');
    form.classList.add('form-hidden');
});

//показать Edit форму
openEditBtn.addEventListener('click', function(e){
    e.preventDefault();
    if(editForm.classList.contains('form-hidden')){
        editForm.classList.remove('form-hidden');
        editForm.classList.add('form-visible');
    } else {
        editForm.classList.remove('form-visible');
        editForm.classList.add('form-hidden');
    }
});

// Скрыть Edit форму
editForm.addEventListener('submit', function (){
    editForm.classList.remove('form-visible');
    editForm.classList.add('form-hidden')
})

document.querySelectorAll('.drivers-list').forEach(item => {
    item.addEventListener('click', function () {
        const driver_id = item.getAttribute("id").split("-")[1];
        window.location.href = `/drivers/driver_factory?id=${driver_id}`;
    })
})