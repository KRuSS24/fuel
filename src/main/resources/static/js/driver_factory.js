

const openEditBtn= document.getElementById('driver-factory-btn-edit');
const editForm = document.getElementById("editForm")
const dismissBtn = document.getElementById('driver-factory-btn-dismiss');
const driverId=document.getElementsByClassName("driver")[0].id;

const form = document.getElementById('formBlock');

dismissBtn.addEventListener('click', (e) => {
    e.preventDefault();
    // window.location.href="drivers/driver_factory";
    window.location.href = `/drivers/driver-dismiss?id=${driverId}`;

})
// показать форму
openEditBtn.addEventListener('click', function (e) {
    e.preventDefault();
    if(editForm.classList.contains('form-hidden')){
        editForm.classList.remove('form-hidden');
        editForm.classList.add('form-visible');
    } else {
        editForm.classList.remove('form-visible');
        editForm.classList.add('form-hidden');
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