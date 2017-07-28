var tags = [];
var toggle = false;
var wordCount = 0;

$(function () {
    $('.popup-form-wrapper').hide();
    
    $('.user').click(function () {
        $('.popup-form-wrapper').slideToggle();
    });
    
    $('#add-tag').click(function () {
        var titleStr = $('#tag-field').val();
        
        if(titleStr.trim() != "") {
            var tag = document.createElement('div');
            var title = document.createElement('label')
            var delButton = document.createElement('i');

            $(tag).addClass('upload-tag');
            $(title).addClass('upload-tag-title');
            $(delButton).addClass('delete-tag');
            $(delButton).addClass('fa');
            $(delButton).addClass('fa-close');

            $(delButton).click(function() {
                $(tag).remove();
            })

            $(title).html(titleStr);
            $(tag).append(title);
            $(tag).append(delButton);
            $('.upload-tag-container').append(tag)
        }
    });

    $("input:checkbox").on('click', function() {
        var $box = $(this);
        if ($box.is(":checked")) {
        var group = "input:checkbox[name='" + $box.attr("name") + "']";
            
        $(group).prop("checked", false);
            $box.prop("checked", true);
        } else {
            $box.prop("checked", false);
        }
    });
    
    $('.upload-container').hide();
    
    $('.add-photo').click(function() {
        $('.upload-container').fadeToggle();
        
        if(toggle) {
            $('.add-photo').rotate(0);
            toggle = false;
        } else {
            $('.add-photo').rotate(45);
            toggle = true;
        }
    });
    
})

function charLimit(limitField, limitCount, limitNum) {
    if (limitField.value.length > limitNum) {
      limitField.value = limitField.value.substring(0, limitNum);
  } else {
      limitCount = limitNum - limitField.value.length;
       }
    console.log(limitCount);
    
    if(limitField.value.length == limitNum) {
        $('.reg-area-update').addClass('warning');
    } else {
        if($('.reg-area-update').hasClass('warning'))
            $('.reg-area-update').removeClass('warning');
    }
    
    
    $('.reg-area-update').html((limitNum - limitCount) + "/" + limitNum);
}