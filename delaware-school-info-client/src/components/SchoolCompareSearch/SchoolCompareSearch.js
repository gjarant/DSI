import React from 'react';
import { Typeahead } from 'react-bootstrap-typeahead';
import { Row, Col } from 'react-bootstrap';

export default function SchoolCompareSearch(props) {

    const handleChangeSelectionOne = (selectedOptions) => props.onClickSelectionOne(Object.keys(selectedOptions).length === 0 ? '' : selectedOptions[0].id);
    const handleChangeSelectionTwo = (selectedOptions) => props.onClickSelectionTwo(Object.keys(selectedOptions).length === 0 ? '' : selectedOptions[0].id);

    return (
        <>
            <Row className='mt-2'>
                <Col className='text-center' md={{ span: 10, offset: 1 }} xs={{ span: 10, offset: 1 }}>
                    <h3>Compare Schools in Delaware</h3>
                </Col>
            </Row>
            <Row className='mt-2'>
                <Col md={{ span: 10, offset: 1 }} xs={{ span: 10, offset: 1 }}>
                    <Typeahead
                        id="schoolSelectionOne"
                        onChange={handleChangeSelectionOne}
                        labelKey={option => `${option.schoolName}`}
                        options={props.optionsTypeAhead}
                        placeholder="Choose School One"
                    />
                </Col>
            </Row>
            <Row className='mt-2'>
                <Col md={{ span: 10, offset: 1 }} xs={{ span: 10, offset: 1 }}>
                    <Typeahead
                        id="schoolSelectionTwo"
                        onChange={handleChangeSelectionTwo}
                        labelKey={option => `${option.schoolName}`}
                        options={props.optionsTypeAhead}
                        placeholder="Choose School Two"
                    />
                </Col>
            </Row>
        </>
    );
}